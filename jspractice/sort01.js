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
sort(arr);
