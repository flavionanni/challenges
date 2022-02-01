function filter_list(l) {
let filter = [];
 for(let item of l) {
    if(typeof(item) == "number") {
      filter.push(item);
    }
 }

return filter;

}
