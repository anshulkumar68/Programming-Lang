const merge = function merge() {
  let arr1 = [1, 3, 9, 22, 79, 84];
  let arr2 = [5, 7, 19, 87];
  let arr3 = [arr1.length + arr2.length];

  let i = 0,
    j = 0,
    k = 0;
  while (i < arr1.length && j < arr2.length) {
    if (arr1[i] < arr2[j]) arr3[k++] = arr1[i++];
    else arr3[k++] = arr2[j++];
  }

  //copy remaining element for array 1
  while (i < arr1.length) arr3[k++] = arr1[i++];

  //copy remaining element for array 2
  while (j < arr2.length) arr3[k++] = arr2[j++];

  // print array
  for (let res of arr3) console.log(res);

  console.log(arr3.join(" "));
};

// merge();

const palindrome = () => {
  let num = 28682,
    rem,
    rev = 0,
    temp = num;

  while (num > 0) {
    rem = num % 10;
    rev = rev * 10 + rem;
    num = Math.floor(num / 10);
  }
  console.log(rev);
  if (temp === rev) console.log("palindrome");
  else console.log("not palindrome");
};

// palindrome();

// string palindrome

const palindrome1 = () => {
  let str = "MOOM";
  let reverseString = str.split("").reverse().join("");

  if (str === reverseString) console.log("palindrome");
  else console.log("not palindrome");
};

palindrome1();