import React,{Component} from 'react';
import './Todo.css'
import List from './List'

class Todo extends Component {
  constructor(props){
    super(props);
    this.state = {
      tasks:[],
      currentTask:''
    }
    this.addTask = this.addTask.bind(this);
    this.handleTask = this.handleTask.bind(this);
    this.removeTask = this.removeTask.bind(this);
    this.updateTasks = this.updateTasks.bind(this);
  }
  addTask(event){
    const newTask = this.state.currentTask;
    if(newTask!==""){
      const tasks1=this.state.tasks
      tasks1.push(newTask);
    this.setState({
      tasks: tasks1,
      currentTask:''
    })
    }
    event.preventDefault();
  }
  handleTask(event){
    this.setState({
      currentTask:event.target.value,
    })
  }
  removeTask(event){
    const filteredTasks= this.state.tasks.filter(task =>
      task!==event);
    this.setState({
      tasks: filteredTasks
    })

  }
  updateTasks(event){
    const tasks = this.state.tasks;
    this.setState({
      tasks: tasks
    })
    
   
  }
 render(){
  return (
    <div className="Todo">
        <form onSubmit={this.addTask}>
          <input type="text" placeholder="Enter task" value= {this.state.currentTask} onChange={this.handleTask}></input>
          <button type="submit">addTask</button>
        </form>
          <List tasks={this.state.tasks} removeTask={this.removeTask} updateTasks={this.updateTasks}/>
    </div>
  );
 }
}

export default Todo