<?php
// Get the PHP helper library from https://twilio.com/docs/libraries/php
require_once '/path/to/vendor/autoload.php'; // Loads the library
use Twilio\Rest\Client;

// Your Account Sid and Auth Token from twilio.com/user/account
// To set up environmental variables, see http://twil.io/secure
$sid = getenv('TWILIO_ACCOUNT_SID');
$token = getenv('TWILIO_AUTH_TOKEN');
$client = new Client($sid, $token);

$recordings = $client->recordings->read(
    array(
        "datecreatedBefore" => "2016-10-15",
        "datecreatedAfter" => "2016-10-12"
    )
);
// Loop over the list of recordings and echo a property for each one
foreach ($recordings as $recording) {
    echo $recording->callSid;
}
