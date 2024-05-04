// ReportController.java
@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/gettotalbyuserid/{userId}")
    public ResponseEntity<ReportDto> getTotalByUserId(@PathVariable Long userId) {
        ReportDto report = reportService.getTotalByUserId(userId);
        return ResponseEntity.ok(report);
    }
}