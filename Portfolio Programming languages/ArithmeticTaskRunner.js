
class ArithmeticTaskRunner{
    constructor(tasks=[]){
        this._tasks = tasks;
    }
    addNegationTask() {
        this._tasks.push(function(x){
           
            //console.log("with negation ", negationValue);
            return -x;
        })
    }
    addAdditionTask(y) {
        this._tasks.push(function(x){
          //console.log("with addition " + additionValue)
            return x+y;
        })
    }
    addMultiplactionTask(y){
        this._tasks.push(function(x){
           
            return x*y;
        })
    }
    
    execute(startValue = 0) { 
        let currentValue = startValue;       
        for (let i=0; i < this._tasks.length; i++) { 
            currentValue = this._tasks[i](currentValue);      
        }  
        return currentValue;       
    }

    get taskCount() {
        return this._tasks.length;
    }
};
taskRunner =  new ArithmeticTaskRunner();
/** 
taskRunner.addAdditionTask(10);
taskRunner.addNegationTask();
taskRunner.addMultiplactionTask(0.5);

console.log(taskRunner.execute());
console.log(taskRunner.execute(10));
console.log(taskRunner.taskCount);



taskRunner.addAdditionTask(2);
taskRunner.addMultiplactionTask(4);
taskRunner.addAdditionTask(10);

console.log(taskRunner.execute(2));
console.log(taskRunner.execute(-2));


taskRunner.addAdditionTask(2);
taskRunner.taskCount = 5;

console.log(taskRunner.taskCount)
*/