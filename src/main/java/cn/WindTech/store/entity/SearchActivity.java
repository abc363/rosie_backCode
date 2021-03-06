package cn.WindTech.store.entity;
//搜索新闻基类
public class SearchActivity {
    private static final long serialVersionUID = 1L;
    private String activity_name;
    private String activity_state;
    private Integer startPage;
    private Integer pageSize;

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_state() {
        return activity_state;
    }

    public void setActivity_state(String activity_state) {
        this.activity_state = activity_state;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "SearchActivity{" +
                "activity_name='" + activity_name + '\'' +
                ", activity_state='" + activity_state + '\'' +
                ", startPage=" + startPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
