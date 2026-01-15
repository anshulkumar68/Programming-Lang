// Find next closest greater number
function closestElement(target){
    let arr = [2,5,1,9,10,7,8];
    let minDiff = Infinity, closest ;
    for(let i=0; i<arr.length; i++){
        if(arr[i]>target) {
            const diff = arr[i]-target;
            if(diff<minDiff){
                minDiff = diff;
                closest = arr[i];
            }
        }
    }
    console.log(closest)
}
closestElement(5)