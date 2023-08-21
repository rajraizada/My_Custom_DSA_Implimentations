/*
    -> Graphs are networks of nodes.
    -> Nodes are referred as vertexes in graphs.

    -> Edges ( Connection between Nodes ) : ( Source Node, Destination Node )
        Based on direction
        1. Unidirectional Edge ( Node1 --> Node2 )
            { Graphs with these edges are called directed graphs }
        2. Bi-directional/Un-directional Edge ( Node1 <--> Node2 ) / ( Node1 ---- Node2 )
            { Graphs with these edges are called Undirected graphs }

        Based on Weight ( Numbers associated with the edges )
                             10                      10
        1. Weighted ( Node1 ----> Node2 ) / ( Node1 ----- Node2 )
            { Graphs with these edges are called Weighted graphs }

        2. Un-weighted ( Node1 ----> Node2 ) / ( Node1 ----- Node2 )
            { Graphs with these edges are called Un-weighted graphs }

    -> Nodes connected via a single edge are called "Neighbours".

    -> Storing a Graph
        1. Adjacency list ( List of Lists )
        2. Adjacency Matrix
        3. Edge list
        4. 2D-Matrix ( Implicit Graph )

 */

package com.company.DataStructures;

import java.util.*;

public class CustomGraph {
    public static void main(String[] args) {


    }

//----------------------------------------------------------------------------------------------------------------------

    public static class customGraph {

       int size=0;
       ArrayList<node> [] arr;

//     Class Node

       public class node{
           String sourceNode;
           String destinationNode;
           int weight;

           node(String sourceNode, String destinationNode, int weight){
               this.sourceNode=sourceNode;
               this.destinationNode=destinationNode;
               this.weight=weight;
           }
       }

//      Constructor of the customGraph

        customGraph(int Size){
            this.arr=new ArrayList[Size];

            for(int i=0; i< arr.length; i++){
                arr[i]=new ArrayList<node>();
            }
        }
//----------------------------------------------------------------------------------------------------------------------

//      Adding a Node

        void addNode(String sourceNode){
          arr[size++].add(new node(sourceNode,null,0));
        }


//      Print Nodes

        void getNodes(){
            System.out.println("All the nodes of your graph are given below: ");
            for (int i=0; i< size; i++) {
                System.out.println(arr[i].get(0).sourceNode);
            }
        }


//      Adding an Edge

        void addEdge(String sourceNode, String destinationNode,int weight){

            int j=0;

            for(int i=0; i<arr.length; i++){
                if(arr[i].get(0).sourceNode==sourceNode){
                    j=i;
                    break;
                }
            }

            arr[j].add(new node(sourceNode,destinationNode,weight));
        }


//      Print all the neighbours of a node

        void getEdges(String sourceNode){

            int j=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].get(0).sourceNode==sourceNode){
                    j=i;
                    break;
                }
            }

            for(int i=1; i<arr[j].size(); i++){
                if( arr[j].get(i).weight==0){
                    System.out.println(sourceNode + " ----> "+ arr[j].get(i).destinationNode);
                } else {
                    System.out.println(sourceNode + " --" + arr[j].get(i).weight + "--> "+ arr[j].get(i).destinationNode);
                }
            }
        }
    }
}
