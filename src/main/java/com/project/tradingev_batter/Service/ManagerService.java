package com.project.tradingev_batter.Service;

import com.project.tradingev_batter.Entity.Notification;
import com.project.tradingev_batter.Entity.PackageService;
import com.project.tradingev_batter.Entity.Product;
import com.project.tradingev_batter.dto.RefundRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ManagerService {
    List<Notification> getNotiForManager(Long managerId);

    void approvePreliminaryProduct(Long productId, String note, boolean approved);

    void inputInspectionResult(Long productId, boolean passed, String note);

    List<Product> getWarehouseProducts();

    void addToWarehouse(Long productId);

    void approveOrder(Long orderId, boolean approved, String note);

    void resolveDispute(Long disputeId, String resolution, RefundRequest refundRequest);

    void approveSellerUpgrade(Long userId, boolean approved); //Quản lý tài khoản người dùng

    void lockUser(Long userId, boolean lock); //Khóa/Mở khóa tài khoản người dùng

    PackageService createPackage(PackageService pkg); //Quản lý gói dịch vụ

    PackageService updatePackage(Long id, PackageService pkg); //Cập nhật gói dịch vụ

    Map<String, Object> getRevenueReport(); //Báo cáo doanh thu

    Map<String, Object> getSystemReport(); //Báo cáo hệ thống

    List<Product> getPendingWarehouseProducts(); //Sản phẩm chờ nhập kho

    void removeFromWarehouse(Long productId, String reason); //Xóa sản phẩm khỏi kho

    void updateWarehouseStatus(Long productId, String newStatus); //Cập nhật trạng thái kho

    void processOrderRefundIfRejected(Long orderId, double depositeAmount); //Xử lý hoàn tiền đơn hàng bị từ chối
}
