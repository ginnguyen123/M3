<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form action="/convert" method="post">
    <div class="crrencyconverter">
        <h1>Currency Converter</h1> <br>
        <label>Rate: </label><br>
        <input type="text" name="rate" placeholder="Rate" value="23000">
        <label>USD: </label><br>
        <input type="text" name="usd" placeholder="USD"><br>
        <input type="submit" value="Converter">
    </div>
</form>
</body>
</html>