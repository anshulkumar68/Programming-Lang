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
  let arr = [3, 62, 62, 26, 2, 22, 29, 29];  
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
    let str = 'Initialize'
    let result = ''
    
    for(let value of str){
        if(!result.includes(value)) result+=value;
    }
    console.log(result)
}

removeDuplicateChar()