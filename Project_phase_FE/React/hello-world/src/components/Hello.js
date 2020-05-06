import React from 'react'

const Hello = () => {
    // return (
    //     <div>
    //         <h1>Hello Johi!</h1>
    //     </div>
    // )
    return React.createElement(
        'div', //<div><div/>
        null, // {id: 'hello', className: class}, <div id=hello class=class></div>
        React.createElement(
            'h1', 
            null, 
            "Hello Johi"
        )
    )
}

export default Hello