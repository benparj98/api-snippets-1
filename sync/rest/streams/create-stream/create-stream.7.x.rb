require 'twilio-ruby'

# Initialize the client
# To set up environmental variables, see http://twil.io/secure
account_sid = ENV['TWILIO_ACCOUNT_SID']
auth_token = ENV['TWILIO_AUTH_TOKEN']
client = Twilio::REST::Client.new(account_sid, auth_token)

# Retreive the service
service = client.sync.v1.services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')

# Create a Sync Stream
stream = service.sync_streams.create(unique_name: 'MyStream')
puts "SID: #{stream.sid}, unique name: #{stream.unique_name}"
