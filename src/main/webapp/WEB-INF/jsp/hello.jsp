<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            		        rel="stylesheet"
            		        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            		        crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body class="bg-success p-2 text-dark bg-opacity-25">
    <div class="container">
    <p>The select column name is used to create a unique value list.</p>
    <form action="" method="POST">
      <label for="columnName">Choose a column name:</label>
      <select name="columnName" id="columnName">
        <option value="kolumna1">Kolumna 1</option>
        <option value="kolumna2">Kolumna 2</option>
        <option value="kolumna3">Kolumna 3</option>
        <option value="kolumna4">Kolumna 4</option>
      </select>
      <br><br>
      <button class="btn btn-dark btn-lg" formaction="/unique-value">Unique</button>
      <button class="btn btn-dark btn-lg" formaction="/duplicate-value">Duplicate</button>
    </form>
</div>

</body>
</html>