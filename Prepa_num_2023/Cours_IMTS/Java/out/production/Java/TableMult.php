<?php

// Création d'une table de multiplication
echo "<h1>Table de multiplication</h1>";

echo "<table border=\"2\" style=\"background-color:yellow\"> <td>
      &nbsp;X &nbsp;</td>";

      for ($i = 1; $i < 10; $i++) {
        echo "<th>&nbsp;$i&nbsp;</th>";
      }
      for ($i = 1; $i < 13; $i++) {
    //Création de la première colonne
    echo "<tr><th>&nbsp;$i&nbsp;</th>";
    //Remplissage de la table
    for ($j=1; $j < 10; $j++) {
        echo "<td style=\"background-color:red;color:#fff\">&nbsp;&nbsp; <b>" . $i * $j . "&nbsp;&nbsp;</td>";
}
echo "</b></tr>";
}
echo "</table>";
echo "<h3>Nous sommes le: </h3>" .date("d/m/y");