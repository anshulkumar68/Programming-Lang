function maxmin() {
  let arr = [23, 52, -5, 1, 52551, 3463, 236252, 3];

  let max = -Infinity;
  let min = Infinity;

  for (let value of arr) {
    if (value > max) max = value;
    if (value < min) min = value;
  }

  return { max, min };
}

// console.log(maxmin());


// Find second largest number in an array
function maxmin2(){
  let arr = [1, 2, 8, 4, 5 ,6, 7, 3]
  let largest = -Infinity;
  let secondLargest = -Infinity;
  
  for(let value of arr){
    if(value > largest){
      secondLargest = largest;
      largest = value;
    }else if(value > secondLargest && value < largest){
      secondLargest = value;
    }
  }
  return secondLargest
}
// console.log(maxmin2());


function maxSecond(){
  let arr = [1, 2, 8, 4, 5 ,6, 7, 3]
  let largest = -Infinity;
  let secondLargest = -Infinity;
  for(let i=0; i<arr.length; i++){
    if(arr[i]>largest){
      secondLargest = largest
      largest = arr[i];
    }
    else if(arr[i]>secondLargest && arr[i] <largest)  secondLargest = arr[i]
  }
  return secondLargest;
}
console.log(maxSecond())