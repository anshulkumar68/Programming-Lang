// Sort an array without using sort()
function sort(){
    let arr = [4, 9 , 13, 1, 13, 2];
    let start=0, index=0;
    for(let i=0; i<arr.length; i++){
        for(let j=i+1; j<arr.length; j++){
            if(arr[i]>arr[j]){
                let temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
    }
    console.log(arr)
}
sort();