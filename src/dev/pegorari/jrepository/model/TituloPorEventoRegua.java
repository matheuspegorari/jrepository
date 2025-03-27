package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TituloPorEventoRegua extends AbstractSankhyaEntity<TituloPorEventoRegua> {
   public BigDecimal getCodRegua() {
        return this.getVo().asBigDecimal("CODREGUA");
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
   }

   public String getMensagem() {
        return this.getVo().asString("MENSAGEM");
   }

   public void setMensagem(String mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getSeqExec() {
        return this.getVo().asBigDecimal("SEQEXEC");
   }

   public void setSeqExec(BigDecimal seqExec) {
        markAsChanged("SEQEXEC", seqExec);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
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
        this.setVo(vo);
        return this;
   }
}
