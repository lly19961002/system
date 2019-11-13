package com.system.util;


import org.apache.ibatis.session.RowBounds;

/**
 * Mybatis分页参数及查询结果封装. 注意所有序号从1开始.
 * 
 * @param <T>
 *            Page中记录的类型.
 **/

/**
 * 
 * @ClassName:  Page   
 * @Description:Page的传入参数
 */
public class Page<T> extends RowBounds {
	/**
	 * 排序 前端组好传过来
	 * 如：cxuhao desc
	 * 或： cxuhao desc,cxuhao desc
	 */
	private String order;
    /**
     * 查询条件
     */
    private T view;

	
    // --分页参数 --//
    /**
     * 页编号 : 第几页
     */
    protected int pageNo = 1;
    /**
     * 页大小 : 每页的数量
     */
    protected int pageSize = 50;



 
 
    public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}



	public String getOrder() {
		return order;
	}



	public void setOrder(String order) {
		this.order = order;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}



	public Page() {
       
    }



    // -- 访问查询参数函数 --//
    /**
     * 获得当前页的页号,序号从1开始,默认为1.
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 获得每页的记录数量,默认为1.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从1开始.
     */
    public int getFirst() {
        return ((pageNo - 1) * pageSize) + 1;
    }

   


	public T getView() {
		return view;
	}

	public void setView(T view) {
		this.view = view;
	}

}
