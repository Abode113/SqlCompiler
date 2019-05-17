import java.util.ArrayList;
import java.util.List;

public class shuffle {

    List<List<String>> MapperData;
    queryData DataObject;

    public shuffle(List<List<String>> MapperData, queryData DataObject){
        this.MapperData = MapperData;
        this.DataObject = DataObject;
    }

    public List<List<List<String>>> process(){

        List<List<Integer>> GroupByData = GroupByData();

        List<List<List<String>>> GroupByList = GroupByList(GroupByData);

        return GroupByList;
    }

    public List<List<List<String>>> GroupByList(List<List<Integer>> GroupByData){

        if(GroupByData != null) {
            List<List<List<String>>> GroupByDataList = new ArrayList<>();
            List<List<String>> FirstGroup = new ArrayList<>();
            FirstGroup.add(this.MapperData.get(0));
            FirstGroup.add(this.MapperData.get(1));
            GroupByDataList.add(FirstGroup);

            for (int i = 0; i < GroupByData.size(); i++) {
                List<List<String>> Group = new ArrayList<>();
                for (int j = 0; j < GroupByData.get(i).size(); j++) {
                    Group.add(this.MapperData.get(GroupByData.get(i).get(j)));
                }
                GroupByDataList.add(Group);
            }

            for (int i = 2; i < this.MapperData.size(); i++) {
                boolean out = false;
                for (int j = 0; j < GroupByData.size(); j++) {
                    if (GroupByData.get(j).contains(i)) {
                        out = true;
                    }
                }
                if (!out) {
                    List<List<String>> Group = new ArrayList<>();
                    Group.add(this.MapperData.get(i));
                    GroupByDataList.add(Group);
                }
            }

            return GroupByDataList;
        }else{
            List<List<List<String>>> OldList = new ArrayList<>();
            OldList.add(this.MapperData);
            return OldList;
        }
    }

    public List<List<Integer>> GroupByData(){

        if(this.DataObject.GroupByList != null) {
            List<String> groupByList = new ArrayList<>();
            for (int i = 0; i < this.DataObject.GroupByList.size(); i++) {
                groupByList.add(this.DataObject.GroupByList.get(i));
            }

            boolean complete = true;
            for (int i = 0; i < groupByList.size(); i++) {
                if (!groupByList.get(i).contains(".")) {
                    complete = false;
                    break;
                }
            }


            if (!complete) {
                for (int i = 0; i < groupByList.size(); i++) {
                    if (groupByList.get(i).contains(".")) {
                        groupByList.set(i, groupByList.get(i).split("\\.")[1]);
                    }
                }
            }

            List<Integer> indexList = new ArrayList<>();
            for (int i = 0; i < groupByList.size(); i++) {
                for (int j = 0; j < this.MapperData.get(1).size(); j++) {
                    if (groupByList.get(i).equalsIgnoreCase(this.MapperData.get(1).get(j))) {
                        indexList.add(j);
                    }
                }
            }

            List<List<Integer>> groupByIndexList = new ArrayList<>();
            for (int i = 2; i < this.MapperData.size(); i++) {
                boolean out = false;
                for (int o = 0; o < groupByIndexList.size(); o++) {
                    if (groupByIndexList.get(o).contains(i)) {
                        out = true;
                        break;
                    }
                }
                if (!out) {
                    List<Integer> group = new ArrayList<>();
                    boolean enter = false;
                    for (int j = i + 1; j < this.MapperData.size(); j++) {
                        boolean innerout = false;
                        for (int o = 0; o < groupByIndexList.size(); o++) {
                            if (groupByIndexList.get(o).contains(i)) {
                                innerout = true;
                                break;
                            }
                        }
                        if (!innerout) {
                            int index = j;
                            for (int k = 0; k < indexList.size(); k++) {
                                if (!this.MapperData.get(i).get(indexList.get(k)).equalsIgnoreCase(this.MapperData.get(j).get(indexList.get(k)))) {
                                    index = -1;
                                }
                            }
                            if (index != -1) {
                                enter = true;
                                group.add(index);
                            }
                        }
                    }
                    if (enter) {
                        group.add(i);
                        groupByIndexList.add(group);
                    }
                }
            }

            return groupByIndexList;
        }else{
            return null;
        }
    }
}




























