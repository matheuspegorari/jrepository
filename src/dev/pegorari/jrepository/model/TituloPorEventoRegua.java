package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TituloPorEventoRegua extends AbstractSankhyaEntity<TituloPorEventoRegua> {
   private BigDecimal codRegua;
   private String mensagem;
   private BigDecimal nuFin;
   private BigDecimal seqExec;
   private String status;

   public BigDecimal getCodRegua() {
        return codRegua;
   }

   public void setCodRegua(BigDecimal codRegua) {
        this.codRegua = codRegua;
   }

   public String getMensagem() {
        return mensagem;
   }

   public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        this.nuFin = nuFin;
   }

   public BigDecimal getSeqExec() {
        return seqExec;
   }

   public void setSeqExec(BigDecimal seqExec) {
        this.seqExec = seqExec;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   @Override
   public String getTableName() {
        return "TGFTXE";
   }

   @Override
   public String getEntityName() {
        return "TituloPorEventoRegua";
   }

   @Override
   public TituloPorEventoRegua fromVO(DynamicVO vo) {
        this.codRegua = vo.asBigDecimal("CODREGUA");
        this.mensagem = vo.asString("MENSAGEM");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.seqExec = vo.asBigDecimal("SEQEXEC");
        this.status = vo.asString("STATUS");
        return this;
   }
}
