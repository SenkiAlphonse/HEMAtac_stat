<h1>HEMAtac fencingstats</h1>
<h2>Setting up the environment</h2>

To run the application you need to have the following things set up:
<ol>
<li>Create a database schema with the help of MySQL</li>
<li>You should set up the following environmental variables:</li>
	<ul>
		<li>DB_HOSTNAME: your hostname in MySQL</li>
		<li>DB_PORT: your port in MySQL</li>
        <li>DB_TYPE: set this to "mysql"</li>
		<li>DB_NAME: the name of the database</li>
		<li>DB_USERNAME: username of the database</li>
		<li>DB_PASSWORD: password for the database</li>
		<li>AUTHORIZATION_CODE: the google OAUTH2 client's authorization code for the Google Calendar API endpoints</li>
		<li>REFRESH_TOKEN: the refresh token that belongs to the Google Calendar API authorization code</li>
		<li>ACCESS_TOKEN: the access token that belongs to the Google Calendar API authozization code</li>
	</ul>

</ol>
