package Controller;

import LocalData.ITripHistory;
import WebData.ICamerasRepository;
import WebData.ICurrentTraficRepository;
import WebData.IRoadsRepository;

public class TripController extends NetController implements IGPSsensor{
    private final ITripHistory iTripHistory;

    public TripController(ITripHistory iTripHistory, IRoadsRepository iRoadsRepository, ICurrentTraficRepository
                                                 iCurrentTraficRepository, ICamerasRepository iCamerasRepository) {
        super(iRoadsRepository, iCurrentTraficRepository,iCamerasRepository);
        this.iTripHistory = iTripHistory;
    }
}
