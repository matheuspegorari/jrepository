package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoArquivoMOBIS extends AbstractSankhyaEntity<ImportacaoArquivoMOBIS> {
   public Timestamp getDhImp() {
        return this.getVo().asTimestamp("DHIMP");
   }

   public void setDhImp(Timestamp dhImp) {
        markAsChanged("DHIMP", dhImp);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public String getNomeArq() {
        return this.getVo().asString("NOMEARQ");
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
   }

   public BigDecimal getNuImp() {
        return this.getVo().asBigDecimal("NUIMP");
   }

   public void setNuImp(BigDecimal nuImp) {
        markAsChanged("NUIMP", nuImp);
   }

   public BigDecimal getQtdPedImp() {
        return this.getVo().asBigDecimal("QTDPEDIMP");
   }

   public void setQtdPedImp(BigDecimal qtdPedImp) {
        markAsChanged("QTDPEDIMP", qtdPedImp);
   }

   public BigDecimal getQtdProc() {
        return this.getVo().asBigDecimal("QTDPROC");
   }

   public void setQtdProc(BigDecimal qtdProc) {
        markAsChanged("QTDPROC", qtdProc);
   }

   public BigDecimal getQtdTotPed() {
        return this.getVo().asBigDecimal("QTDTOTPED");
   }

   public void setQtdTotPed(BigDecimal qtdTotPed) {
        markAsChanged("QTDTOTPED", qtdTotPed);
   }

   public String getReprocessar() {
        return this.getVo().asString("REPROCESSAR");
   }

   public void setReprocessar(String reprocessar) {
        markAsChanged("REPROCESSAR", reprocessar);
   }

   public String getTipArquivo() {
        return this.getVo().asString("TIPARQUIVO");
   }

   public void setTipArquivo(String tipArquivo) {
        markAsChanged("TIPARQUIVO", tipArquivo);
   }

   public String getArqHeader() {
        return this.getVo().asString("ARQHEADER");
   }

   public void setArqHeader(String arqHeader) {
        markAsChanged("ARQHEADER", arqHeader);
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
        this.setVo(vo);
        return this;
   }
}
