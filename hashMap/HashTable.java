package hashMap;

import java.util.LinkedList;

public class HashTable<K, V> {
	private class HTPair {
		K key;
		V value;
		HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public boolean equals(Object other) {
			HTPair op = (HTPair) other;
			return this.key.equals(op.key);
		}
		
		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}
	}
	public static final int DEFAULT_CAPACITY = 10;
	private LinkedListGeneric<HTPair>[] bucketArray;
	private int size;
	
	public HashTable() {
		this(DEFAULT_CAPACITY);
	}

	public HashTable(int capacity) {
		// TODO Auto-generated constructor stub
		this.bucketArray = (LinkedListGeneric<HTPair>[])new LinkedListGeneric[capacity];
		this.size = 0;
	}
	
	public void put(K key, V value) throws Exception {
		int bi = hashFunction(key);
		LinkedListGeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair pta = new HTPair(key, value);
		if (bucket == null) {
			bucket = new LinkedListGeneric<HTPair>();
			bucket.addLast(pta);
			this.bucketArray[bi] = bucket;
			this.size++;
		} else {
			int findAt = bucket.find(pta);
			if(findAt == -1) {
				bucket.addLast(pta);
				this.size++;
			} else {
				HTPair pair = bucket.getAt(findAt);
				pair.value = value;
			}
		}
		
		double lamda = (this.size*1.0)/this.bucketArray.length;
		if (lamda > 0.75) {
			this.rehash();
		}
	}
	
	public V get(K key) throws Exception {
		int bi = hashFunction(key);
		LinkedListGeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if(findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				return pair.value;
			}
		}
	}
	
	public V remove(K key) throws Exception {
		int bi = hashFunction(key);
		LinkedListGeneric<HTPair> bucket = this.bucketArray[bi];
		HTPair ptf = new HTPair(key, null);
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if(findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				bucket.removeAt(findAt);
				this.size--;
				return pair.value;
			}
		}	
	}
	
	private void rehash() throws Exception {
		LinkedListGeneric<HTPair>[] oba = this.bucketArray;
		this.bucketArray = (LinkedListGeneric<HTPair>[])new LinkedListGeneric[2 * oba.length];
		this.size = 0;
		for (LinkedListGeneric<HTPair> ob : oba) {
			while (ob != null && !ob.isEmpty()) {
			HTPair pair = ob.removeFirst();
			this.put(pair.key, pair.value);
			}
		}
	}

	private int hashFunction(K key) {
		// TODO Auto-generated method stub
		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		return bi;
	}
	
	public void display() {
		for (LinkedListGeneric<HashTable<K, V>.HTPair> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
				System.out.println("**************************");
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
