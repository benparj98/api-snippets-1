<?php
// Get the PHP helper library from https://twilio.com/docs/libraries/php
require_once '/path/to/vendor/autoload.php'; // Loads the library

use Twilio\Rest\Client;

// Your Account Sid and Auth Token from twilio.com/user/account
// To set up environmental variables, see http://twil.io/secure
$accountSid = getenv('TWILIO_ACCOUNT_SID');
$authToken = getenv('TWILIO_AUTH_TOKEN');

$client = new Client($accountSid, $authToken);

$workspace = $client->taskrouter->workspaces
    ->create(
        "NewWorkspace",
        array(
            'eventCallbackUrl' => 'http://requestb.in/vh9reovh',
            'template' => 'FIFO'
        )
    );

echo $workspace->friendlyName;
