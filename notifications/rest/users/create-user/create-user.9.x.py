#!/usr/bin/env python
# Install the Python helper library from twilio.com/docs/python/install
import os

from twilio.rest import Client

# To set up environmental variables, see http://twil.io/secure
ACCOUNT_SID = os.environ['TWILIO_ACCOUNT_SID']
AUTH_TOKEN = os.environ['TWILIO_AUTH_TOKEN']

client = Client(ACCOUNT_SID, AUTH_TOKEN)
user = client.notify.services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX') \
             .users.create(identity='User0001',
                           segment=['premium', 'fitness-lifestyle'])

print(user.sid)
