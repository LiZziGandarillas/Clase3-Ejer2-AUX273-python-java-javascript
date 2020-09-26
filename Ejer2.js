process.stdin.on('data',function(data){
	var sc=data.toString().split(" ");
	var x = [0,0,0,0];
	for(var i=0; i<4; i++)
	{
		x[i]=parseInt(sc[i]);
	}
	x.sort((a,b)=>a-b);
	console.log(x[2]);
	process.exit();
});
