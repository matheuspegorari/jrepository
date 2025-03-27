package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecucaoAtividade extends AbstractSankhyaEntity<ExecucaoAtividade> {
   public BigDecimal getCodMtp() {
        return this.getVo().asBigDecimal("CODMTP");
   }

   public void setCodMtp(BigDecimal codMtp) {
        markAsChanged("CODMTP", codMtp);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public Timestamp getDhInicio() {
        return this.getVo().asTimestamp("DHINICIO");
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
   }

   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getIdeiAtv() {
        return this.getVo().asBigDecimal("IDEIATV");
   }

   public void setIdeiAtv(BigDecimal ideiAtv) {
        markAsChanged("IDEIATV", ideiAtv);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public BigDecimal getIdAtv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
   }

   @Override
   public String getTableName() {
        return "TPREIATV";
   }

   @Override
   public String getEntityName() {
        return "ExecucaoAtividade";
   }

   @Override
   public ExecucaoAtividade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
