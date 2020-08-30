import React from 'react';
function List(props){
    const tasks = props.tasks;
    const listTasks = tasks.map(task =>
   {
       return <>
     <p>
         <input type="text" value={task} onChange={(event)=>{
             props.updateTasks(event.target.value)}}/>
        <button onClick={() => {
            props.removeTask(task)
        }}>RemoveTask</button>
     </p>
    </>})
    return <>
          {listTasks}    
    </>;
  }
  export default List;