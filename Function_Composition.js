
       
  var compose = function(functions) {
  if(functions.length===0){
     return function(x){
        return x;
     }
  }
    // Call each function in the array, passing in x as the argument.
    return function(x){
   var res = functions[functions.length - 1](x);  
   for (var i = functions.length - 2; i >= 0; i--) {
      res=functions[i](res);
   }
   return res;
  };
};
