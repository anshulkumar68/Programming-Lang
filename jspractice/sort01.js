// Move all zeros to the end of an array.
function moveZero(){
  let arr = [5, 0 , 11, 3, 0, 0, 22, 1];
  let index = 0;
  let s = 0, e =arr.length-1;
  for(let i=0; i<arr.length; i++){
    if(arr[i]!==0) arr[index++] = arr[i]
  }
  while(index < arr.length) arr[index++] = 0;
  console.log(arr);
}
moveZero()


function sort(arr) {
  let s = 0,
    e = arr.length - 1;

  while (s <= e) {
    if (arr[s] === 0) {
      s++;
    } else if (arr[e] === 1) {
      e--;
    } else if (arr[s] === 1 && arr[e] === 0 && s < e) {
      arr[s++] = 0;
      arr[e--] = 1;
    }
  }

  // Print the sorted array
  console.log(arr.join(" "));
}

// Test the function
const arr = [1, 0, 0, 1, 0, 1, 0];
// sort(arr);

