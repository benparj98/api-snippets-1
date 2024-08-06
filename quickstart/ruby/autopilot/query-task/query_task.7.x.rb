# Download the helper library from https://www.twilio.com/docs/ruby/install
require 'rubygems'
require 'twilio-ruby'

# Your Account Sid and Auth Token from twilio.com/console
# To set up environmental variables, see http://twil.io/secure
account_sid = ENV['TWILIO_ACCOUNT_SID']
auth_token = ENV['TWILIO_AUTH_TOKEN']
@client = Twilio::REST::Client.new(account_sid, auth_token)

# Replace 'UAXXX...' with your Assistant's unique SID https://www.twilio.com/console/autopilot/list
query = @client.preview.understand
                       .assistants('UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
                       .queries
                       .create(language: 'en-US', query: 'Tell me a joke')

puts query.results['task']
