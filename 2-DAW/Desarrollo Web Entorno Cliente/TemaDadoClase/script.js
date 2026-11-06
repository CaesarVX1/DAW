function quitarN(matrioska, acumulador = 0) {

  matrioska += acumulador;

  let posicionCopia = matrioska[acumulador];

  console.log('quedan ${posicionCopia}');

  if (matrioska.length === acumulador + 1) {
    return;
  }

  return quitarN(matrioska, acumulador + 1);
}

const matrioska = ["1", "2", "3", "4", "5"];
quitarN(matrioska);

console.log(matrioska);