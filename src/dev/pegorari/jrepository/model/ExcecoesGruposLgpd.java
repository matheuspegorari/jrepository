package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesGruposLgpd extends AbstractSankhyaEntity<ExcecoesGruposLgpd> {
   public BigDecimal getCodCla() {
        return this.getVo().asBigDecimal("CODCLA");
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public String getTipoVisu() {
        return this.getVo().asString("TIPOVISU");
   }

   public void setTipoVisu(String tipoVisu) {
        markAsChanged("TIPOVISU", tipoVisu);
   }

   @Override
   public String getTableName() {
        return "TSIEXG";
   }

   @Override
   public String getEntityName() {
        return "ExcecoesGruposLgpd";
   }

   @Override
   public ExcecoesGruposLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
