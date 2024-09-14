import React from 'react';
import ReactDOM from 'react-dom';

function repeatAfterDelay(callback, delay) {
  setTimeout(function() {
    callback();
    repeatAfterDelay(callback, delay); // 自己再帰的に繰り返す
  }, delay);
}

class ParentComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      parentValue: 'Hello, Parent!',
      count1: 0
    };
  }

  componentDidMount() {
    var i = 1;

    repeatAfterDelay(() => {
      i = i + 1;
      this.setState({ parentValue: 'New Value!' + i,
      count1: i + i
    });
    }, 1000);

    
  }

  render() {
    return (
      <div>
        <ChildComponent value={this.state.parentValue} count1={this.state.count1 }/>
      </div>
    );
  }
}

class ChildComponent extends React.Component {
  render() {
    return (
      <div>
        <p>{this.props.value}</p>
        <p>{this.props.count1}</p>
      </div>
    );
  }
}

ReactDOM.render(<ParentComponent />, document.getElementById('root'));
