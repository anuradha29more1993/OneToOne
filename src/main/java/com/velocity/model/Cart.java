package com.velocity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String cartName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCartName() {
			return cartName;
		}
		public void setCartName(String cartName) {
			this.cartName = cartName;
		}
		
		@Override
		public String toString() {
			return "Cart [id=" + id + ", cartName=" + cartName + "]";
		}
		
}
