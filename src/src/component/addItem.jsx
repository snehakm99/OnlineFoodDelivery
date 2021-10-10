import React, { Component } from "react";
import axios from "axios";

class addItem extends Component {
  state = {
    item: {
      itemName: "",
      itemId: 0,
    },
  };
  handleChange = (e) => {
    const item = { ...this.state.item };
    item[e.target.name] = e.target.value;
    this.setState({ item: item });
    this.setState({ item });
  };
  handleSubmit = (e) => {
    e.preventDefault();
    axios
      .post("http://localhost:8082/item", this.state.item)
      .then(() => {
        this.props.history.push("/item");
      });
  };

  render() {
    return (
      <div>
        <div className="container">
          <div>
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <h2 className="text-cener">Add Item</h2>
              <div className="card-body">
                <form onSubmit={this.handleSubmit}>
                  <div className="form-group">
                    <label>Item Name</label>
                    <input
                      placeholder="Item Name"
                      className="form-control"
                      name="itemName"
                      value={this.state.item.itemName}
                      onChange={this.handleChange}
                    />
                  </div>
                  <button type="submit" class="btn btn-primary">
                    Submit
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default addItem;