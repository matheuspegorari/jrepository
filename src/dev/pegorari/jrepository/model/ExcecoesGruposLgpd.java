package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesGruposLgpd extends AbstractSankhyaEntity<ExcecoesGruposLgpd> {
   private BigDecimal codCla;
   private BigDecimal codGrupo;
   private String tipoVisu;

   public BigDecimal getCodCla() {
        return codCla;
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
        this.codCla = codCla;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public String getTipoVisu() {
        return tipoVisu;
   }

   public void setTipoVisu(String tipoVisu) {
        markAsChanged("TIPOVISU", tipoVisu);
        this.tipoVisu = tipoVisu;
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
        this.setOriginalVO(vo);
        this.codCla = vo.asBigDecimal("CODCLA");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.tipoVisu = vo.asString("TIPOVISU");
        return this;
   }
}
