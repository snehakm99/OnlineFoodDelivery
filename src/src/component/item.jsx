import React, { Component } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

class Item extends Component {
  state = {
    item: [],
  };
  componentDidMount() {
    axios.get("http://localhost:8082/item").then((res) => {
      console.log(res);
      this.setState({ item: res.data });
    });
  }
  handleDelete = (itemId) => {
    axios
      .delete(`http://localhost:8082/item/${itemId}`)
      .then((res) => {
        const item = this.state.item.filter(
          (p) => p.itemid !== itemId
        );
        this.setState({ item: item });
        this.props.history.push("/item");
      });
  };
  handleView(itemId) {
    this.props.history.push(`/viewItem/${itemId}`);
  }
  render() {
    const { item } = this.state;

    return (
      <div>
        <h3>ITEM PAGE</h3>
        <div>
          <Link to="/addItem">
            <button className="btn btn-secondary">Add-Item</button>
          </Link>
        </div>
        <div>
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th scope="col">itemName</th>
                <th scope="col">Action</th>
              </tr>
            </thead>
            <tbody>
              {item.map((res) => (
                <tr key={res.itemId}>
                  <th scope="row">{res.itemId}</th>
                  <td>{res.itemName}</td>
                  <td>
                    <Link to={`/updateitem/${res.itemId}`}>
                      <button
                        type="button"
                        className="btn btn-outline-primary bi bi-file-earmark-check-fill"
                      ></button>
                    </Link>
                    <button
                      type="button"
                      style={{ marginLeft: "10px" }}
                      className="btn btn-outline-primary bi bi bi-scissors"
                      onClick={() => this.handleDelete(res.itemId)}
                    ></button>
                    <button
                      type="button"
                      className="btn btn-info"
                      style={{ marginLeft: "10px" }}
                      onClick={() => this.handleView(res.itemId)}
                    >
                      View
                    </button>
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default Item;