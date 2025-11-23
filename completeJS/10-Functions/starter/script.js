'use strict';

///////////////////////////////////////
// CALL BY VALUE AND REFERENCE
// const flight = 'AI876';
// const passenger = {
//   name: 'Anshul',
//   passport: 479742,
// };

// const checkIn = function (flightNum, passenger) {
//   flightNum = 'AI999';
//   passenger.name = 'Mr.' + passenger.name;

//   if (passenger.passport === 479742) {
//     alert('CHECKED-IN');
//   } else {
//     alert('WRONG PASSPORT !');
//   }
// };

// checkIn(flight, passenger);
// console.log(flight);
// console.log(passenger);

///////////////////////////////////////
// FUNCTION RETURNING FUNCTION

const greet = function (greeting) {
  return function (name) {
    console.log(`${greeting} ${name}`);
  };
};

const greeter = greet('Hey');
greeter('Anshul');

greet('Hello')('Anshul');
