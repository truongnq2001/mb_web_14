package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.DanhGia;
import model.PhanLoaiSP;
import model.SanPham;
import java.util.ArrayList;
import java.util.List;

public final class Danh_005fmuc_005fsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setLocale_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setLocale_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.release();
    _jspx_tagPool_fmt_setLocale_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/logonho.png\" type=\"image/x-icon\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("              crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/danh-muc-sp.css\">\r\n");
      out.write("        <title>MBShop</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-menu\">\r\n");
      out.write("        <div class = \"Menu\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"trangchu\"> <img src=\"img/logo.png\" style=\"width: 100%; margin-top: 3px;\"> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"search\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Bạn cần tìm gì?\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn-search\">\r\n");
      out.write("                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"topnav\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"trangchu\">\r\n");
      out.write("                        <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <p>Trang chủ</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"danh_muc_sp\">\r\n");
      out.write("                        <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <p>Sản phẩm</p> \r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"gio-hang.html\">\r\n");
      out.write("                        <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <p>Giỏ hàng</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"gioi-thieu.html\">\r\n");
      out.write("                        <i class=\"fa fa-info-circle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <p>Giới thiệu</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"login.jsp\">\r\n");
      out.write("                        <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <p>Đăng nhập</p>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <a onclick=\"topFunction()\" id=\"back-to-top\" title=\"Go to top\">\r\n");
      out.write("        <div class=\"top\">\r\n");
      out.write("            <i class=\"fa fa-lg fa-chevron-up\" aria-hidden=\"true\" style=\"zoom: 0.75;\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("    </a>\r\n");
      out.write("        <div class=\"slideshow-container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mySlides fade\">\r\n");
      out.write("                <img src=\"img/banners/banner4.png\" style=\"width:100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mySlides fade\">\r\n");
      out.write("                <img src=\"img/banners/banner8.png\" style=\"width:100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mySlides fade\">\r\n");
      out.write("                <img src=\"img/banners/banner7.png\" style=\"width:100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mySlides fade\">\r\n");
      out.write("                <img src=\"img/banners/banner9.png\" style=\"width:100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mySlides fade\">\r\n");
      out.write("                <img src=\"img/banners/banner6.png\" style=\"width:100%\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div style=\"text-align:center\">\r\n");
      out.write("            <span class=\"dot\"></span> \r\n");
      out.write("            <span class=\"dot\"></span> \r\n");
      out.write("            <span class=\"dot\"></span> \r\n");
      out.write("            <span class=\"dot\"></span> \r\n");
      out.write("            <span class=\"dot\"></span> \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"banner\">\r\n");
      out.write("            <a href=\"#\"> <img src=\"img/banners/blackFriday.gif\" style=\"width:100%\"> </a>\r\n");
      out.write("        </div>  \r\n");
      out.write("        <div class=\"company-menu\">\r\n");
      out.write("            <div class=\"company-menu-line\">\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'iphone')\"><img src=\"img/company/Apple.jpg\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'coolpad')\"><img src=\"img/company/Coolpad.png\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'xiaomi')\"><img src=\"img/company/Xiaomi.png\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'huawei')\"><img src=\"img/company/Huawei.jpg\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"company-menu-line\">\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'samsung')\"><img src=\"img/company/Samsung.jpg\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'oppo')\"><img src=\"img/company/Oppo.jpg\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'nokia')\"><img src=\"img/company/Nokia.jpg\"></a>\r\n");
      out.write("                <a href=\"#\" onclick=\"layUrl('thuong-hieu', 'realme')\"><img src=\"img/company/Realme.png\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"button-container\">\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"all\">Giá bán</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('gia', 'duoi2trieu')\">Dưới 2 triệu</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('gia', 'tu2den4trieu')\">Từ 2 - 4 triệu</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('gia', 'tu4den7trieu')\">Từ 4 - 7 triệu</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('gia', 'tu7den13trieu')\">Từ 7 - 13 triệu</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('gia', 'tren13trieu')\">Trên 13 triệu</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"sale\">Khuyến mãi</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('khuyen-mai', 'giamgia')\">Giảm giá</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('khuyen-mai', 'tragop')\">Trả góp</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('khuyen-mai', 'moiramat')\">Mới ra mắt</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"sort\">Sắp xếp</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('sap-xep', 'giatangdan')\">Giá tăng dần</a>\r\n");
      out.write("                    <a href=\"#\" onclick=\"layUrl('sap-xep', 'giagiamdan')\">Giá giảm dần</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"filter\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search-filter\">\r\n");
      out.write("            <input type=\"text\" placeholder=\"Nhập tên cần tìm...\">\r\n");
      out.write("        </div>\r\n");
      out.write("         ");

            List<SanPham> list = (List<SanPham>) request.getAttribute("tatca");
            for (int num = 0; num <= list.size()/4; num ++) {
        
      out.write("\r\n");
      out.write("        <div class=\"product-list\">\r\n");
      out.write("            <div class=\"product\">\r\n");
      out.write("                 ");

                     for (int i = 4*num; i<4*(num+1) && i<list.size(); i++) {
                 
      out.write("\r\n");
      out.write("                 <div class=\"card\">\r\n");
      out.write("                        <img src=\"");
      out.print( list.get(i).getHinhAnh().get(0).getPath());
      out.write("\" style=\"width:100%\">\r\n");
      out.write("                        <a href=\"chi_tiet_san_pham?id=");
      out.print( list.get(i).getIdSanPham());
      out.write('"');
      out.write('>');
      out.print( list.get(i).getTenSP());
      out.write("</a>\r\n");
      out.write("                        </br>\r\n");
      out.write("                        </br>\r\n");
      out.write("                        </br>                    \r\n");
      out.write("                        <p class=\"price\">");
      if (_jspx_meth_fmt_setLocale_0(_jspx_page_context))
        return;
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_0.setParent(null);
      _jspx_th_fmt_formatNumber_0.setValue( list.get(i).getGia());
      _jspx_th_fmt_formatNumber_0.setType("currency");
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
      if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      out.write("</p>\r\n");
      out.write("                        <div class=\"ratingresult\">\r\n");
      out.write("                            ");

                                for (int j = 0; j < list.get(i).trungBinhSoSao(); j++) {
                            
      out.write("\r\n");
      out.write("                            <i class=\"fa fa-star\"></i>                           \r\n");
      out.write("                            ");

                                }
                            
      out.write("  \r\n");
      out.write("                            ");

                                for (int j = list.get(i).trungBinhSoSao(); j <5; j++) {
                            
      out.write("\r\n");
      out.write("                            <i class=\"fa fa-star-o\"></i>                           \r\n");
      out.write("                            ");

                                }
                            
      out.write("                        \r\n");
      out.write("                            <span>");
      out.print( list.get(i).getDanhGia().size() );
      out.write(" đánh giá</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

                    }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("        <div class=\"plc\">\r\n");
      out.write("            <ul class=\"flex-contain\">\r\n");
      out.write("                <li>Giao hàng hỏa tốc trong 1 giờ</li>\r\n");
      out.write("                <li>Thanh toán linh hoạt: tiền mặt, visa / master, trả góp</li>\r\n");
      out.write("                <li>Trải nghiệm sản phẩm tại nhà</li>\r\n");
      out.write("                <li>Lỗi đổi tại nhà trong 1 ngày</li>\r\n");
      out.write("                <li>Hỗ trợ suốt thời gian sử dụng.\r\n");
      out.write("                    <br>Hotline:\r\n");
      out.write("                    <a href=\"tel:12345678\" style=\"color: #288ad6;\">12345678</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"main-footer\">\r\n");
      out.write("            <div class=\"container-main-footer\">\r\n");
      out.write("                <div class=\"about-us\">\r\n");
      out.write("                    <p style=\"font-size: 19px; font-weight: 600; margin: 11px 0px -6px 0px;\">Về chúng tôi</p>\r\n");
      out.write("                    <p style=\"line-height: 1.4;\">MBShop là chuỗi cửa hàng điện thoại uy tín, chất lượng hàng đầu Việt Nam.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <div class=\"mxh\">\r\n");
      out.write("                        <i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <i class=\"fa fa-instagram\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        <i class=\"fa fa-twitter-square\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"information\">\r\n");
      out.write("                    <p style=\"font-size: 19px; font-weight: 600; margin: 11px 0px -6px 0px;\">Thông tin</p>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"index.html\">Trang chủ</a></li>\r\n");
      out.write("                        <li style=\"margin: 6px 0px 6px 0px;\"><a href=\"danh-muc-sp.html\">Sản phẩm</a></li>\r\n");
      out.write("                        <li style=\"margin: 6px 0px 6px 0px;\"><a href=\"gio-hang.html\">Giỏ hàng</a></li>\r\n");
      out.write("                        <li><a href=\"gioi-thieu.html\">Giới thiệu</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"contact-us\">\r\n");
      out.write("                    <p style=\"font-size: 19px; font-weight: 600; margin: 11px 0px -6px 0px;\">Liên hệ</p>\r\n");
      out.write("                    <div class=\"contact-us-ele\">\r\n");
      out.write("                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\" style=\"margin-top: 10px; zoom: 1.7;\"></i>\r\n");
      out.write("                        <p>96A Trần Phú, P. Mộ Lao, Hà Đông, Hà Nội</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"contact-us-ele\">\r\n");
      out.write("                        <i class=\"fa fa-envelope\" aria-hidden=\"true\" style=\"margin: 0px 12px 0px 0px; zoom: 1.2;\"></i>\r\n");
      out.write("                        <p style=\"margin-top: 1px;\">mbshop@gmail.com</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"contact-us-ele\">\r\n");
      out.write("                        <i class=\"fa fa-phone\" aria-hidden=\"true\" style=\"zoom: 1.6;\"></i>\r\n");
      out.write("                        <p style=\"margin-top: 2px;\">0123456789</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"copyright\">\r\n");
      out.write("        <p>Copyright © 2022 by Team 14</p>\r\n");
      out.write("    </div>\r\n");
      out.write("        <script src=\"js/index.js\"></script> \r\n");
      out.write("        <script>\r\n");
      out.write("                        const thuongHieu = {\r\n");
      out.write("                            iphone: 'iPhone',\r\n");
      out.write("                            coolpad: 'COOLPAD',\r\n");
      out.write("                            xiaomi: 'XIAOMI',\r\n");
      out.write("                            huawei: 'HUAWEI',\r\n");
      out.write("                            samsung: 'SAMSUNG',\r\n");
      out.write("                            oppo: 'OPPO',\r\n");
      out.write("                            nokia: 'NOKIA',\r\n");
      out.write("                            realme: 'REALME'\r\n");
      out.write("                        };\r\n");
      out.write("                        const gia = {\r\n");
      out.write("                            duoi2trieu: 'Dưới 2 triệu',\r\n");
      out.write("                            tu2den4trieu: 'Từ 2 - 4 triệu',\r\n");
      out.write("                            tu4den7trieu: 'Từ 4 - 7 triệu',\r\n");
      out.write("                            tu7den13trieu: 'Từ 7 - 13 triệu',\r\n");
      out.write("                            tren13trieu: 'Trên 13 triệu'\r\n");
      out.write("                        };\r\n");
      out.write("                        const khuyenMai = {\r\n");
      out.write("                            giamgia: 'Giảm giá',\r\n");
      out.write("                            tragop: 'Trả góp',\r\n");
      out.write("                            moiramat: 'Mới ra mắt'\r\n");
      out.write("                        };\r\n");
      out.write("                        const sapXep = {\r\n");
      out.write("                            giatangdan: 'Giá tăng dần',\r\n");
      out.write("                            giagiamdan: 'Giá giảm dần'\r\n");
      out.write("\r\n");
      out.write("                        };\r\n");
      out.write("\r\n");
      out.write("                        let thuongHieuActive = null;\r\n");
      out.write("                        let giaActive = null;\r\n");
      out.write("                        let khuyenMaiActive = null;\r\n");
      out.write("                        let sapXepActive = null;\r\n");
      out.write("\r\n");
      out.write("                        locGia();\r\n");
      out.write("                        locThuongHieu();\r\n");
      out.write("                        locKhuyenMai();\r\n");
      out.write("                        locSapXep();\r\n");
      out.write("\r\n");
      out.write("                        function locThuongHieu() {\r\n");
      out.write("                            thuongHieuActive = layUrlParameter('thuong-hieu');\r\n");
      out.write("                            if (!thuongHieuActive) {\r\n");
      out.write("                                return 0;\r\n");
      out.write("                            }\r\n");
      out.write("                            let html = '';\r\n");
      out.write("                            html += '<div class=\"choose-filter-container\">';\r\n");
      out.write("                            html += `<button class=\"choose-filter-btn\">`;\r\n");
      out.write("                            html += `<p style=\"margin: 0px 0px;\">`;\r\n");
      out.write("                            html += thuongHieu[thuongHieuActive];\r\n");
      out.write("                            html += `</p>`;\r\n");
      out.write("                            html += `</button>`;\r\n");
      out.write("                            html += `</div>`;\r\n");
      out.write("                            document.querySelector('.filter').innerHTML += html;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        function locGia() {\r\n");
      out.write("                            giaActive = layUrlParameter('gia');\r\n");
      out.write("                            if (!giaActive) {\r\n");
      out.write("                                return 0;\r\n");
      out.write("                            }\r\n");
      out.write("                            let html = '';\r\n");
      out.write("                            html += '<div class=\"price-filter-container\">';\r\n");
      out.write("                            html += `<button class=\"choose-filter-btn\">`;\r\n");
      out.write("                            html += `<p style=\"margin: 0px 0px;\">`;\r\n");
      out.write("                            html += gia[giaActive];\r\n");
      out.write("                            html += `</p>`;\r\n");
      out.write("                            html += `</button>`;\r\n");
      out.write("                            html += `</div>`;\r\n");
      out.write("                            document.querySelector('.filter').innerHTML += html;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        function locKhuyenMai() {\r\n");
      out.write("                            khuyenMaiActive = layUrlParameter('khuyen-mai');\r\n");
      out.write("                            if (!khuyenMaiActive) {\r\n");
      out.write("                                return 0;\r\n");
      out.write("                            }\r\n");
      out.write("                            let html = '';\r\n");
      out.write("                            html += '<div class=\"sale-filter-container\">';;\r\n");
      out.write("                            html += `<button class=\"choose-filter-btn\">`;;\r\n");
      out.write("                            html += `<p style=\"margin: 0px 0px;\">`;\r\n");
      out.write("                            html += khuyenMai[khuyenMaiActive];\r\n");
      out.write("                            html += `</p>`;\r\n");
      out.write("                            html += `</button>`;\r\n");
      out.write("                            html += `</div>`;\r\n");
      out.write("                            document.querySelector('.filter').innerHTML += html;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        function locSapXep() {\r\n");
      out.write("                            sapXepActive = layUrlParameter('sap-xep');\r\n");
      out.write("                            if (!sapXepActive) {\r\n");
      out.write("                                return 0;\r\n");
      out.write("                            }\r\n");
      out.write("                            let html = '';\r\n");
      out.write("                            html += '<div class=\"sort-filter-container\">';\r\n");
      out.write("                            html += `<button class=\"choose-filter-btn\">`;\r\n");
      out.write("                            html += `<p style=\"margin: 0px 0px;\">`;\r\n");
      out.write("                            html += sapXep[sapXepActive];\r\n");
      out.write("                            html += `</p>`;\r\n");
      out.write("                            html += `</button>`;\r\n");
      out.write("                            html += `</div>`;\r\n");
      out.write("                            document.querySelector('.filter').innerHTML += html;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        if (((thuongHieuActive !== null) || (giaActive !== null)\r\n");
      out.write("                                || (khuyenMaiActive !== null)||(sapXepActive !== null))\r\n");
      out.write("                                && (!document.querySelector('.delete-filter-container'))) {\r\n");
      out.write("                            let html = '';\r\n");
      out.write("                            html += '<div class=\"delete-filter-container\">';\r\n");
      out.write("                            html += '<a href=\"danh-muc-sp.html\"><button class=\"delete-filter-btn\">Xóa bộ lọc</button></a>';\r\n");
      out.write("                            html += '</div>';\r\n");
      out.write("                            document.querySelector('.filter').innerHTML += html;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        function layUrl(key, value) {\r\n");
      out.write("                            const url_string = window.location.href;\r\n");
      out.write("                            const url = new URL(url_string);\r\n");
      out.write("                            url.searchParams.set(key, value);\r\n");
      out.write("                            window.location.href = url.href;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                        function layUrlParameter(key) {\r\n");
      out.write("                            let url_string = window.location.href;\r\n");
      out.write("                            let url = new URL(url_string);\r\n");
      out.write("                            let value = url.searchParams.get(key);\r\n");
      out.write("                            return value;\r\n");
      out.write("                        }\r\n");
      out.write("        </script>    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_setLocale_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_0.setParent(null);
    _jspx_th_fmt_setLocale_0.setValue(new String("vi_VN"));
    int _jspx_eval_fmt_setLocale_0 = _jspx_th_fmt_setLocale_0.doStartTag();
    if (_jspx_th_fmt_setLocale_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
    return false;
  }
}
