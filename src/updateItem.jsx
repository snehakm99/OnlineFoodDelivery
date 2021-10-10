import React, { Component } from "react";
import axios from "axios";

class updateItem extends Component {
  state = {
    item: {
      itemName: "",
      itemId: 0,
    },
  };
  componentDidMount() {
    axios
      .get(
        `http://localhost:8082/item/${this.props.match.params.itemId}`
      )
      .then((res) => {
        console.log(res);
        this.setState({ item: res.data });
      });
  }
  handleChange = (e) => {
    const item = { ...this.state.item };
    item[e.target.name] = e.target.value;
    this.setState({ item: item });
    this.setState({ item });
  };
  handleSubmit = (e) => {
    e.preventDefault();
    axios
      .put(
        `http://localhost:8082/item/${this.props.match.params.itemId}`,
        this.state.item
      )
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
              <h2 className="text-cener">Update Item</h2>
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
                    Update
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

export default updateItem;