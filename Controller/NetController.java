package Controller;

import WebData.ICamerasRepository;
import WebData.ICurrentTraficRepository;
import WebData.IRoadsRepository;

public class NetController {
    private final IRoadsRepository iRoadsRepository;
    private final ICurrentTraficRepository iCurrentTraficRepository;
    private final ICamerasRepository iCamerasRepository;


    public NetController(IRoadsRepository iRoadsRepository, ICurrentTraficRepository iCurrentTraficRepository, ICamerasRepository iCamerasRepository) {
        this.iRoadsRepository = iRoadsRepository;
        this.iCurrentTraficRepository = iCurrentTraficRepository;
        this.iCamerasRepository = iCamerasRepository;
    }
}
