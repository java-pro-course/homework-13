$url = 'https://httpbin.org/anything';

$headers = ['Content-Type: application/json']; // заголовки нашего запроса

$post_data = [ // поля запроса
    'field1' => 'val_1',
    'field2' => 'val_2',
];

$data_json = json_encode($get_data); // переводим поля в формат JSON

$curl = curl_init();
curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($curl, CURLOPT_VERBOSE, 1);
curl_setopt($curl, CURLOPT_POSTFIELDS, $data_json);
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_CUSTOMREQUEST, 'GET');

$result = curl_exec($curl); // результат GET запроса 

--------------------------------------------------------------------------------

$url = 'https://httpbin.org/anything';

$headers = ['Content-Type: application/json']; // заголовки нашего запроса

$post_data = [ // поля запроса
    'field1' => 'val_1',
    'field2' => 'val_2',
];

$data_json = json_encode($post_data); // переводим поля в формат JSON

$curl = curl_init();
curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($curl, CURLOPT_VERBOSE, 1);
curl_setopt($curl, CURLOPT_POSTFIELDS, $data_json);
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_POST, true);

$result = curl_exec($curl); // результат POST запроса 

-------------------------------------------------------------------------------

$url = 'https://httpbin.org/anything';

$headers = ['Content-Type: application/json']; // заголовки нашего запроса

$post_data = [ // поля запроса
    'field1' => 'val_1',
    'field2' => 'val_2',
];

$data_json = json_encode($put_data); // переводим поля в формат JSON

$curl = curl_init();
curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($curl, CURLOPT_VERBOSE, 1);
curl_setopt($curl, CURLOPT_POSTFIELDS, $data_json);
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_PUT, true);

$result = curl_exec($curl); // результат PUT запроса 
