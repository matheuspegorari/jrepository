package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoArquivoMOBIS extends AbstractSankhyaEntity<ImportacaoArquivoMOBIS> {
   private Timestamp dhImp;
   private char[] msg;
   private String nomeArq;
   private BigDecimal nuImp;
   private BigDecimal qtdPedImp;
   private BigDecimal qtdProc;
   private BigDecimal qtdTotPed;
   private String reprocessar;
   private String tipArquivo;
   private String arqHeader;

   public Timestamp getDhImp() {
        return dhImp;
   }

   public void setDhImp(Timestamp dhImp) {
        markAsChanged("DHIMP", dhImp);
        this.dhImp = dhImp;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
        this.nomeArq = nomeArq;
   }

   public BigDecimal getNuImp() {
        return nuImp;
   }

   public void setNuImp(BigDecimal nuImp) {
        markAsChanged("NUIMP", nuImp);
        this.nuImp = nuImp;
   }

   public BigDecimal getQtdPedImp() {
        return qtdPedImp;
   }

   public void setQtdPedImp(BigDecimal qtdPedImp) {
        markAsChanged("QTDPEDIMP", qtdPedImp);
        this.qtdPedImp = qtdPedImp;
   }

   public BigDecimal getQtdProc() {
        return qtdProc;
   }

   public void setQtdProc(BigDecimal qtdProc) {
        markAsChanged("QTDPROC", qtdProc);
        this.qtdProc = qtdProc;
   }

   public BigDecimal getQtdTotPed() {
        return qtdTotPed;
   }

   public void setQtdTotPed(BigDecimal qtdTotPed) {
        markAsChanged("QTDTOTPED", qtdTotPed);
        this.qtdTotPed = qtdTotPed;
   }

   public String getReprocessar() {
        return reprocessar;
   }

   public void setReprocessar(String reprocessar) {
        markAsChanged("REPROCESSAR", reprocessar);
        this.reprocessar = reprocessar;
   }

   public String getTipArquivo() {
        return tipArquivo;
   }

   public void setTipArquivo(String tipArquivo) {
        markAsChanged("TIPARQUIVO", tipArquivo);
        this.tipArquivo = tipArquivo;
   }

   public String getArqHeader() {
        return arqHeader;
   }

   public void setArqHeader(String arqHeader) {
        markAsChanged("ARQHEADER", arqHeader);
        this.arqHeader = arqHeader;
   }

   @Override
   public String getTableName() {
        return "TGFIMPMOBIS";
   }

   @Override
   public String getEntityName() {
        return "ImportacaoArquivoMOBIS";
   }

   @Override
   public ImportacaoArquivoMOBIS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dhImp = vo.asTimestamp("DHIMP");
        this.msg = vo.asClob("MSG");
        this.nomeArq = vo.asString("NOMEARQ");
        this.nuImp = vo.asBigDecimal("NUIMP");
        this.qtdPedImp = vo.asBigDecimal("QTDPEDIMP");
        this.qtdProc = vo.asBigDecimal("QTDPROC");
        this.qtdTotPed = vo.asBigDecimal("QTDTOTPED");
        this.reprocessar = vo.asString("REPROCESSAR");
        this.tipArquivo = vo.asString("TIPARQUIVO");
        this.arqHeader = vo.asString("ARQHEADER");
        return this;
   }
}
