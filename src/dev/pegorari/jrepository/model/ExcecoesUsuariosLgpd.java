package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExcecoesUsuariosLgpd extends AbstractSankhyaEntity<ExcecoesUsuariosLgpd> {
   public BigDecimal getCodCla() {
        return this.getVo().asBigDecimal("CODCLA");
   }

   public void setCodCla(BigDecimal codCla) {
        markAsChanged("CODCLA", codCla);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getTipoVisu() {
        return this.getVo().asString("TIPOVISU");
   }

   public void setTipoVisu(String tipoVisu) {
        markAsChanged("TIPOVISU", tipoVisu);
   }

   @Override
   public String getTableName() {
        return "TSIEXU";
   }

   @Override
   public String getEntityName() {
        return "ExcecoesUsuariosLgpd";
   }

   @Override
   public ExcecoesUsuariosLgpd fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
