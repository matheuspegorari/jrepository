package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class UsuarioFirebaseMessaging extends AbstractSankhyaEntity<UsuarioFirebaseMessaging> {
   public String getCodFcm() {
        return this.getVo().asString("CODFCM");
   }

   public void setCodFcm(String codFcm) {
        markAsChanged("CODFCM", codFcm);
   }

   public Timestamp getDhRegistro() {
        return this.getVo().asTimestamp("DHREGISTRO");
   }

   public void setDhRegistro(Timestamp dhRegistro) {
        markAsChanged("DHREGISTRO", dhRegistro);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodApp() {
        return this.getVo().asString("CODAPP");
   }

   public void setCodApp(String codApp) {
        markAsChanged("CODAPP", codApp);
   }

   public String getPlataforma() {
        return this.getVo().asString("PLATAFORMA");
   }

   public void setPlataforma(String plataforma) {
        markAsChanged("PLATAFORMA", plataforma);
   }

   @Override
   public String getTableName() {
        return "TSIFCM";
   }

   @Override
   public String getEntityName() {
        return "UsuarioFirebaseMessaging";
   }

   @Override
   public UsuarioFirebaseMessaging fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
