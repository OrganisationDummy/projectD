<!DOCTYPE html>
<html lang="de">
	<head>
		<meta charset="utf-8">
		<title>ProjectD</title>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
		<script src="../static/js/account/account.js"></script>
	</head>
	<body>
		<header>
			<h1>ProjectD</h1>
			<h2>Anmdelden</h2>
		</header>
		<div class="content">
			<article>
				<table>
					<caption>Eingaben</caption>
					<tr>
						<th><label for="username">Benutzername:</label></th>
						<td><input class="inputField" type="text" id="username" name="username" /></td>
					</tr>
					<tr>
						<th><label for="password">Passwort:</label></th>
						<td><input class="inputField" type="text" id="password" name="password" /></td>
					</tr>
					<tr>
						<td><input class="inputButton" type="button" id="reset" name="reset" value="Leeren" /></td>
						<td><input class="inputButton" type="button" id="login" name="login" value="Anmdelden" /></td>
					</tr>
				</table>
			</article>
		</div>
		<footer></footer>
	</body>
</html>