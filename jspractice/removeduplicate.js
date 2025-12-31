//  REMVOE DUPLICATE ELEMENTS FROM AN ARRAY
function removeDuplicates(){
    let arr = [3, 62, 62, 26, 2, 22, 29, 29];
    let unique = [];
    for(let i=0; i<arr.length; i++){
        if(!unique.includes(arr[i]))
            unique.push(arr[i])
    }
    console.log(unique)
}
// removeDuplicates()

function removeDuplicates2() {
  let arr = [3, 6, 6, 2, 1, 7, 1];  
  let seen = {};
  let result = [];

  for (let i = 0; i < arr.length; i++) {
    if (!seen[arr[i]]) {
      seen[arr[i]] = true;
      result.push(arr[i]);
    }
  }
  return result;
}

// console.log(removeDuplicates2())

// REMOVE DUPLICATE CHARACTERS FROM A STRING
function removeDuplicateChar(){
    let str = 'Anshul Kumar'.toLowerCase();
    let res = '';
    for(let char of str){
      if(!res.includes(char)) res+=char
    }
    console.log(res);
}
// removeDuplicateChar()


function findDuplicate() {
  let arr = [3, 6, 6, 2, 1, 7, 1, 1];  
  let seen = {};
  let duplicate = [];

  for (let num of arr){
    if(seen[num]){
      if(!duplicate.includes(num)) {
        duplicate.push(num)
      }
    }
    else{
      seen[num] = true;
    }
  }
  console.log(duplicate)
}

findDuplicate()