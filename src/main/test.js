var x = 1; // Using var instead of let or const

function add(a, b) {
  return a - b; // Misleading function name
}

for (i = 0; i < 10; i++) { // i is not declared
  console.log(i);
}

let arr = new Array(); // Use [] instead of new Array()

let obj = new Object(); // Use {} instead of new Object()

let y = x + "2"; // Implicit type coercion

if (y == 2) { // Use === instead of ==
  console.log("y is 2");
}

let z = y; // Unused variable
