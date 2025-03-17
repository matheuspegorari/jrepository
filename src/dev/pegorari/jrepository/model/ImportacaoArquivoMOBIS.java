package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoArquivoMOBIS implements SankhyaEntity<ImportacaoArquivoMOBIS> {

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
        this.dhImp = dhImp;
   }

   public char[] getMsg() {
        return msg;
   }

   public void setMsg(char[] msg) {
        this.msg = msg;
   }

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        this.nomeArq = nomeArq;
   }

   public BigDecimal getNuImp() {
        return nuImp;
   }

   public void setNuImp(BigDecimal nuImp) {
        this.nuImp = nuImp;
   }

   public BigDecimal getQtdPedImp() {
        return qtdPedImp;
   }

   public void setQtdPedImp(BigDecimal qtdPedImp) {
        this.qtdPedImp = qtdPedImp;
   }

   public BigDecimal getQtdProc() {
        return qtdProc;
   }

   public void setQtdProc(BigDecimal qtdProc) {
        this.qtdProc = qtdProc;
   }

   public BigDecimal getQtdTotPed() {
        return qtdTotPed;
   }

   public void setQtdTotPed(BigDecimal qtdTotPed) {
        this.qtdTotPed = qtdTotPed;
   }

   public String getReprocessar() {
        return reprocessar;
   }

   public void setReprocessar(String reprocessar) {
        this.reprocessar = reprocessar;
   }

   public String getTipArquivo() {
        return tipArquivo;
   }

   public void setTipArquivo(String tipArquivo) {
        this.tipArquivo = tipArquivo;
   }

   public String getArqHeader() {
        return arqHeader;
   }

   public void setArqHeader(String arqHeader) {
        this.arqHeader = arqHeader;
   }

   @Override
   public String getEntityName() {
        return "ImportacaoArquivoMOBIS";
   }

   @Override
   public ImportacaoArquivoMOBIS fromVO(DynamicVO vo) {
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
