// let n = 5, fact =1;
// for(let i=5; i>=1; i--)
//     fact=fact*i;
// console.log(fact);

// factorial

const calcfactorial = function () {
  let n = 6,
    fact = 1;
  for (let i = 5; i >= 1; i--) fact = fact * i;
  console.log(fact);
};

// calcfactorial();

//prime
const checkPrime = (num) => {
  let i = 2;
  while (i < num) {
    if (num % 2 === 0) {
      console.log("not prime");
      break;
    } else console.log("prime");
    break;
  }
  i++;
};

// checkPrime(73);

//Ascending and descending

const ascDesc = () => {
  let arr = [89, 13, 279, 198, 127, 76, 123, 28];
  size = arr.length;
  let resArr = [],
    i = 0;

  // asc
  for (let i = 0; i < size / 2 - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      let temp;
      temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }

  //desc
  for (i = size / 2; i < size - 1; i++) {
    if (arr[i] < arr[i + 1]) {
      temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }

  for (let i of arr) {
    console.log(i + " ");
  }
};

ascDesc();
